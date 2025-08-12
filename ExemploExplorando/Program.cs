using ExemploExplorando.Models;
using System.Globalization;


Dictionary<string, string> estados = new Dictionary<string, string>();

estados.Add("SP", "São Paulo");
estados.Add("SE", "Sergipe");
estados.Add("AL", "Alagoas");


Console.WriteLine(estados["AL"]);


// foreach(var item in estados)
// {
//   Console.WriteLine($"Chave: {item.Key}, valor: {item.Value}");
// }

// estados.Add("RJ", "Rio de janeiro");

// foreach(var item in estados)
// {
//   Console.WriteLine($"Chave: {item.Key}, valor: {item.Value}");
// }

// Console.WriteLine("-------------");

// estados.Remove("BA");
// estados["SP"] = "São paulo - novo valor";

// foreach(var item in estados)
// {
//   Console.WriteLine($"Chave: {item.Key}, valor: {item.Value}");
// }

// string chave ="BA";
// Console.WriteLine($"Verificandoo elemento: {chave}");

// if (estados.ContainsKey(chave))
// {
//   Console.WriteLine($"Valor existente: {chave}");
// } 
// else
// {
//   Console.WriteLine($"Valor não existe. É seguro adicionar a chave: {chave}")
// }



























// Stack<int> pilha = new Stack<int>();

// pilha.Push(3);
// pilha.Push(45);
// pilha.Push(34);
// pilha.Push(13);

// foreach(int item in pilha)
// {
//   Console.WriteLine(item);
// }

// Console.WriteLine($"Removendo o elemento do topo: {pilha.Pop()}");

// pilha.Push(24);

// foreach(int item in pilha)
// {
//   Console.WriteLine(item);
// }


















// Queue<int> fila = new Queue<int>();

// fila.Enqueue(2);
// fila.Enqueue(6);
// fila.Enqueue(13);
// fila.Enqueue(8);

// foreach(int item in fila)
// {
//   Console.WriteLine(item);
// }

// Console.WriteLine($"Removendo o elemento: {fila.Dequeue()}");
// fila.Enqueue(14);

// foreach(int item in fila)
// {
//   Console.WriteLine(item);
// }






























//new ExemploExcecao().Metodo1();







































// try
// {
//   string[] linhas = File.ReadAllLines("Arquivos/arquivo_Leitura.txt");

//   foreach(string linha in linhas)
//   {
//     Console.WriteLine(linha);
//   }
// }
// catch (FileNotFoundException ex)
// {
//   Console.WriteLine($"Não foi possivel encontrar o arquivo. {ex.Message}");

// }
// catch(Exception ex)
// {
//   Console.WriteLine($"Ocorreu uma exceção genérica. {ex.Message}");
// } 
// finally
// {
//   Console.WriteLine("Chegou até aqui");
// }



































// string dataString = "2024-09-30 18:00";

// bool sucesso = DateTime.TryParseExact(dataString, "yyyy-MM-dd HH:mm", CultureInfo.InvariantCulture, DateTimeStyles.None, out DateTime data);

// if(sucesso)
// {
//   Console.WriteLine($"Conversão com sucesso! Data: {data}");
// }
// else
// {
//   Console.WriteLine($"{dataString} não é uma data válida");
// }










































// CultureInfo.DefaultThreadCurrentCulture = new CultureInfo("pt-BR");

// decimal valorMonetario = 1542.50M;

// Console.WriteLine(valorMonetario.ToString("C", CultureInfo.CreateSpecificCulture("en-US")));

// double porcentagem = .3421;

// Console.WriteLine(porcentagem.ToString("P"));

// int numero = 123456;
// Console.WriteLine(numero.ToString("##-##-##"));

















































// Pessoa p1 = new Pessoa(nome: "Douglas", sobrenome: "Macário");
// Pessoa p2 = new Pessoa(nome: "Carol", sobrenome: "carvalho Morais");

// Curso cursoDeIngles = new Curso();
// cursoDeIngles.Nome = "Inglês";
// cursoDeIngles.Alunos = new List<Pessoa>();

// cursoDeIngles.AdicionarAluno(p1);
// cursoDeIngles.AdicionarAluno(p2);
// cursoDeIngles.ListarAlunos();





























// Pessoa p1 = new Pessoa();

// p1.Nome = "Douglas";
// p1.Sobrenome="Macário";
// p1.Idade = 21;
// p1.Apresentar();