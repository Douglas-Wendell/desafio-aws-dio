using teste.models;

int vmin, vmax;

// Validação para a entrada das velocidades mínima e máxima
while (true)
{
  vmin = Convert.ToInt32(Console.ReadLine());

  
  vmax = Convert.ToInt32(Console.ReadLine());

  // Verifica se os valores são válidos
  if (vmin >= 1 && vmax > vmin && vmax <= 100)
  {
    break;
  }
        
}

Robo r1 = new Robo(vmin, vmax);

string comandos = Console.ReadLine();
//char[] comandosArray = comandos.ToCharArray();

foreach (char comando in comandos)
{
  if (comando == 'A')
  {
    r1.Acelerar();
  }
  else if (comando == 'D')
  {
    r1.Desacelerar();
  }
}

// Exibe a velocidade final
Console.WriteLine(r1.VelocidadeAtual);