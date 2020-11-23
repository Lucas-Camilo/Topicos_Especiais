class Reporter extends Funcionario {
    private String registro;

    public Reporter(String n_registro)
    {
        registro = n_registro;
    }

    public void setRegistro(String n_registro) {
        registro = n_registro;
    }

    public String getRegistro() {
        return registro;
    }
}
