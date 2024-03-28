import { time } from "console";
import View from "../../components/View"

const Home = async () => {

  const result = await fetch("https://jsonplaceholder.typicode.com/todos")
  const json = await result.json()

  return (
    <main>
      <View id={json.id} title={json.title}/>
      
      
    </main>  );
}

export default Home;
