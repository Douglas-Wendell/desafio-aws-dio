public class PetMachine {

  private boolean clean = true; // A máquina começa limpa

  private int water = 30; // Capacidade máxima de água

  private int shampoo = 10; // Capacidade máxima de shampoo

  private Pet pet;

  public void takeAShower() {
    if (this.pet == null) {
      System.out.println("Coloque o pet na máquina para iniciar o banho.");
      return;
    }

    this.water -= 10;
    this.shampoo -= 2;
    pet.setClean(true);
    System.out.println("O pet " + pet.getName() + " está limpo.");
  }

  public void addWater() {
    if (water == 30) {
      System.out.println("A capacidade de água da máquina está no máximo.");
      return;
    }

    water += 2;
  }

  public void addShampoo() {
    if (shampoo == 10) {
      System.out.println("A capacidade de shampoo da máquina está no máximo.");
      return;
    }

    shampoo += 2;
  }

  public int getWater() {
    return water;
  }

  public int getShampoo() {
    return shampoo;
  }

  public boolean hasPet() {
    return pet != null;
  }

  public void setPet(Pet pet) {
    if (!this.clean) {
      System.out.println("A máquina não está limpa. Por favor, limpe a máquina antes de colocar o pet.");
      return;
    }

    if (hasPet()) {
      System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento.");
      return;
    }

    this.pet = pet;
    System.out.println("Pet " + pet.getName() + " foi colocado na máquina.");

  }

  public void removePet() {
    this.clean = this.pet.isClean();
    System.out.println("O pet " + this.pet.getName() + " está limpo.");
    this.pet = null;
  }

  public void wash() {
    this.water -= 3;
    this.shampoo -= 1;
    this.clean = true;
    System.out.println("A máquina foi lavada.");
  }
}
