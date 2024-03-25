SELECT d.department_id,
        d.department_name,
        e.employee_id,
        e.first_name
FROM departments d
INNER JOIN employees e ON d.department_id = e.department_id;

SELECT 
    c.country_name as NomePais,
    r.region_name as NomeRegiao 
FROM countries c
INNER JOIN regions r ON c.region_id = r.region_id;


// Exercicios Lista Joins

// EX 1

SELECT d.department_name, ROUND(AVG(e.salary),2) AS avg_salary
FROM departments d
INNER JOIN employees e ON d.department_id = e.department_id
GROUP BY d.department_name;

select 
    d.department_name as nome_departamento,
    count(e.employee_id) as numero_funcionarios
    from departments d
    left join employees e on d.department_id = e.department_id
    group by d.department_name;
    


        