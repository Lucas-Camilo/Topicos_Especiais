class Jornal {
        private String titulo;
        private String tipo;

        public Jornal(String n_titulo, String n_tipo)
        {
                titulo = n_titulo;
                tipo = n_tipo;
        }
        
        public void setTitulo(String n_titulo)
        {
                titulo = n_titulo;
        }
        public String getTitulo()
        {
                return titulo;
        }
        public void setTipo(String n_tipo)
        {
                tipo = n_tipo;
        }
        public String getTipo()
        {
                return tipo;
        }
}
