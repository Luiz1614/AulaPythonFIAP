package fiap.tds.repositories;

import fiap.tds.infrastructure.OracleDbConfiguration;
import fiap.tds.entities.Produto;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoRepository {

    public static final String TB_NAME = "PRODUTO";

    public List<Produto> getAll(){
        var produtos = new ArrayList<Produto>();
        try(var conn = new OracleDbConfiguration().getConnection();
            var stmt = conn.prepareStatement("SELECT * FROM " + TB_NAME +" ORDER BY ID")){
            var rs = stmt.executeQuery();
            while(rs.next()){
                produtos.add(new Produto(
                        rs.getInt("ID"),
                        rs.getString("NOME"),
                        rs.getDouble("PRECO")));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return produtos;
    }

    /**
     * Método que retorna uma lista de produtos de acordo com os filtros e ordenação
     * @param nome Nome do produto
     * @param preco Preço do produto
     * @param orderBy Coluna para ordenação
     * @param direction Direção da ordenação
     * @param limit Quantidade de registros
     * @param offset Quantidade de registros a serem pulados
     * @return Lista de produtos
     */
    public List<Produto> getAll(String nome, double preco, String orderBy, String direction, int limit, int offset) {
        var produtos = new ArrayList<Produto>();
        try(var conn = new OracleDbConfiguration().getConnection();
            var stmt = conn.prepareStatement(
                    // Query para buscar os produtos
                    // O OFFSET é a quantidade de registros que serão pulados
                    // O FETCH NEXT é a quantidade de registros que serão retornados
                    // O ORDER BY é a coluna que será ordenada
                    // O ASC é a direção da ordenação
                    // O LIKE é um operador de comparação que busca registros que contenham o valor
                    // ex completo da query: SELECT * FROM PRODUTO WHERE NOME LIKE ? AND PRECO <= ? ORDER BY ID ASC OFFSET 0 ROWS FETCH NEXT 10 ROWS ONLY
                    // esta query busca produtos que contenham o nome passado no parâmetro nome e que tenham o preço menor ou igual ao preço passado no parâmetro preco
                    ("SELECT * FROM %s WHERE NOME LIKE ? AND PRECO <= ? ORDER BY %s %s OFFSET %d " +
                            "ROWS FETCH NEXT %d ROWS ONLY")
                            .formatted(TB_NAME, orderBy, direction == null || direction.isEmpty() ? "ASC"
                                            : direction,
                                    offset, limit == 0 ? 10 : limit)
            )){
            stmt.setString(1, "%"+nome+"%");
            stmt.setDouble(2, preco);
            var rs = stmt.executeQuery();
            while (rs.next()){
                produtos.add(new Produto(
                        rs.getInt("ID"),
                        rs.getString("NOME"),
                        rs.getDouble("PRECO")));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public List<Produto> getAllByCategoria(int idCategoria){
        var produtos = new ArrayList<Produto>();
        try(var conn = new OracleDbConfiguration().getConnection();
        var stmt = conn.prepareStatement("SELECT * FROM " + TB_NAME + " WHERE IDCATEGORIA = ?");){
            stmt.setInt(1, idCategoria);
            var rs = stmt.executeQuery();
            while (rs.next()){
                produtos.add(new Produto(
                        rs.getInt("ID"),
                        rs.getString("NOME"),
                        rs.getDouble("PRECO")));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public Optional<Produto> get(int id){
        try(var conn = new OracleDbConfiguration().getConnection();
            var stmt = conn.prepareStatement("SELECT * FROM " + TB_NAME + " WHERE ID = ?")
        ){
            stmt.setInt(1, id);
            var rs = stmt.executeQuery();
            if(rs.next()){
               return Optional.of(new Produto(
                        rs.getInt("ID"),
                        rs.getString("NOME"),
                        rs.getDouble("PRECO")));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return Optional.empty();
    }

    public void create(Produto produto){
        try(var conn = new OracleDbConfiguration().getConnection();
        var stmt = conn.prepareStatement("INSERT INTO " + TB_NAME + " (NOME, PRECO) VALUES (?,?)")){
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int id, Produto produto){
        try(var conn = new OracleDbConfiguration().getConnection();
        var stmt = conn.prepareStatement("UPDATE "+ TB_NAME + " SET NOME = ?, PRECO = ? WHERE ID = ?");)
        {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2,produto.getPreco());
            stmt.setInt(3, id);
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int count(String nome, double preco){
        try(var conn = new OracleDbConfiguration().getConnection();
        var stmt = conn.prepareStatement("SELECT COUNT(*) FROM " +
                TB_NAME + " WHERE NOME LIKE ? AND PRECO <= ? ")){
            stmt.setString(1, "%"+nome+"%");
           stmt.setDouble(2, preco);
           var result = stmt.executeQuery();
           if(result.next()){
               return result.getInt(1);
           }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
    }

}
