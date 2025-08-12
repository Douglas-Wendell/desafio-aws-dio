using Exemplofundamentos.Models;


List<string> listaString = new List<string>();

listaString.Add("MG");
listaString.Add("SP");
listaString.Add("AL");



Console.WriteLine("Percorrendo o array com o FOR");
for (int contador = 0; contador < listaString.Count; contador++)
{
  Console.WriteLine($"Posição N° {contador} - {listaString[contador]}");
}

int contadorForeach = 0;
Console.WriteLine("Percorrendo o array com o FOREACH");
foreach(string item in listaString)
{
  Console.WriteLine($"Posição N° {contadorForeach} - {item}");
  contadorForeach++;
}




































// int[] arrayInteiros = new int[4];

// arrayInteiros[0] = 72;
// arrayInteiros[1] = 84;
// arrayInteiros[2] = 19;
// arrayInteiros[3] = 10;


// int[] arrayInteirosDobrado = new int[arrayInteiros.Length * 2];
// Array.Copy(arrayInteiros, arrayInteirosDobrado, arrayInteiros.Length);


// //Array.Resize(ref arrayInteiros, arrayInteiros.Length * 2);



// Console.WriteLine("Percorrendo o array com o FOR");
// for(int contador = 0; contador < arrayInteiros.Length; contador++)
// {
//   Console.WriteLine($"Posição N° {contador} - {arrayInteiros[contador]}");
// }



















// Console.WriteLine("Percorrendo o array com o FOREACH");

// int contadorForeach = 0;
// foreach(int valor in arrayInteiros)
// {
//   Console.WriteLine($"Posição N° {contadorForeach} - {valor}");
//   contadorForeach++;
// }





























// string? opcao;
// bool exibirMenu = true;

// while (exibirMenu)
// {
//   Console.Clear();
//   Console.WriteLine("Digite a sua opção:");
//   Console.WriteLine("1 - Cadastrar cliente");
//   Console.WriteLine("2 - Buscar cliente");
//   Console.WriteLine("3 - Apagar cliente");
//   Console.WriteLine("4 - Encerrar");

//   opcao = Console.ReadLine();

//   switch(opcao)
//   {
//     case "1":
//       Console.WriteLine("Cadastro de cliente");
//       break;

//     case "2":
//       Console.WriteLine("Busca de cliente");
//       break;

//     case "3":
//       Console.WriteLine("Apagar cliente");
//       break;

//     case "4":
//       Console.WriteLine("Encerrar");
//       exibirMenu = false;
//       //Environment.Exit(0); encerra tudo
//       break;

//     default:
//       Console.WriteLine("Opção inválida");
//       break;
//   }
// }

// Console.WriteLine("O programa se encerrou");





















// int soma = 0, numero = 0;


// do 
// {
//   Console.WriteLine("Digite um número para a soma (0 para encerrar)");
//   numero = Convert.ToInt32(Console.ReadLine());

//   soma += numero;

// } while (numero != 0);

// Console.WriteLine($"Resultado da soma dos números digitados é: {soma}");





























// Console.WriteLine("Digite um número para fazer sua tabuada");
// int numero = Convert.ToInt32(Console.ReadLine());
// int contador = 1;
// while(contador <= 10)
// {
//   Console.WriteLine($"{numero} x {contador} = {numero * contador}");
//   contador++;

//   if(contador > 5)
//   {
//     break;
//   }
// }

















// Console.WriteLine("Digite um número para fazer sua tabuada");
// int numero = Convert.ToInt32(Console.ReadLine());

// for (int contador= 0; contador <= 10; contador++)
// {
//   Console.WriteLine($"{numero} x {contador} = {numero * contador}");
// }



























//Calculadora calc = new Calculadora();

// calc.Somar(5, 7);
// calc.Subtrair(10, 50);
// calc.Multiplicar(15, 45);
// calc.Dividir(2, 2);
//calc.Potencia(3, 3);
// calc.Seno(30);
// calc.Coseno(30);
// calc.Tangente(30);
//calc.RaizQuadrada(9);


// int numeroIncremento = 10;

// int numeroDecremento = 20;

// Console.WriteLine(numeroIncremento);
// Console.WriteLine("Incrementando o 10");

// numeroIncremento++;

// Console.WriteLine(numeroIncremento);




// Console.WriteLine(numeroDecremento);
// Console.WriteLine("Decrementando o 20");

// numeroDecremento--;

// Console.WriteLine(numeroDecremento);













// bool choveu = false;
// bool estaTarde = false;

// if (!choveu && !estaTarde)
// {
//   Console.WriteLine("Vou pedalar");
// }
// else
// {
//   Console.WriteLine("Vou pedalar um outro dia");
// }






















// bool possuiPresencaMinima = true;
// double media = 7.5;

// if (possuiPresencaMinima && media >= 7)
// {
//   Console.WriteLine("Aprovado!");
// }
// else
// {
//   Console.WriteLine("Reprovado!");
// }



















// bool ehMaiorDeIdade = true;
// bool possuiAutorizacaoDoResponsavel = false;

// if (ehMaiorDeIdade || possuiAutorizacaoDoResponsavel)
// {
//   Console.WriteLine("Entrada liberada!");
// }
// else
// {
//   Console.WriteLine("Entrada não liberada!");
// }













// Console.WriteLine("Digite uma letra: ");
// string? letra = Console.ReadLine();

// switch (letra)
// {
//   case "a"  "A":
//   case "e"  "E":
//   case "i"  "I":
//   case "o"  "O":
//   case "u"  "U":
//     Console.WriteLine("Vogal");
//     break; 

//   default:
//     Console.WriteLine("Não vogal");
//     break;
// }














// if (letra == "a" || letra =="A")
// {
//   Console.WriteLine("Vogal");
// }
// else 
// {
//   Console.WriteLine("n vogal");
// }


























// int quantidadeEmEstoque = 10;

// int quantidadeCompra = 15;

// bool possivelVenda = quantidadeCompra > 0 && quantidadeCompra <= quantidadeEmEstoque;

// Console.WriteLine($"Quantidade em estoque: {quantidadeEmEstoque}");
// Console.WriteLine($"Quantidade compra: {quantidadeCompra}");
// Console.WriteLine($"É possivel realizar a venda? {possivelVenda}");




// if (quantidadeCompra == 0)
// {
//   Console.WriteLine("Venda inválida!");
// }
// else if (possivelVenda)
// {
//   Console.WriteLine("Prosseguir comprando?");
// }
// else 
// {
//   Console.WriteLine("Quantidade não suportada em estoque!");
// }





















// double a = 2 + 4 / 2;

// Console.WriteLine(a);









// int inteiro = 5;

// string a = inteiro.ToString();

// Console.WriteLine(a);








// int a = Convert.ToInt32 ("5");

// Console.WriteLine(a);








// int a = 10;
// int b =20;

// int c = a + b;

// Console.WriteLine(c);










// DateTime dataAtual = DateTime.Now.AddDays(10);
// Console.WriteLine(dataAtual);










// string apresentacao = "Olá, seja bem vindo";

// int quantidade = 1;

// double altura = 1.68;

// decimal preco = 1.90M;

// bool condicao = true;

// Console.WriteLine(apresentacao);
// Console.WriteLine("Valor da variável quantidade: " + quantidade);
// Console.WriteLine("Valor da variável altura: " + altura.ToString("0.00"));
// Console.WriteLine("Valor da variável preco: " + preco);
// Console.WriteLine("Valor da variável condicao: " + condicao);



// Pessoa p = new Pessoa();

// p.Nome = "Douglas";
// p.Idade = 21;
// p.Apresentar();
