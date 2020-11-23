class Main {
  public static void main(String[] args) {
    System.out.println("\nSeja Bem vindo ao Clarin Diario");
    Jornal novo_jornal = new Jornal("Nova Linguagem", "diario");
    Editor novo_editor = new Editor();
    Reporter novo_reporter = new Reporter("012");
    System.out.println(novo_jornal.getTitulo());
  }
}