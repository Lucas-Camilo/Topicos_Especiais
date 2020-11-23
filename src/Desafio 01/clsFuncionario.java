import java.util.List;

class Funcionario {
        protected String nome;
        protected Jornal qualJornal;
        private List<Jornal> jornais;

        public void setNome(String n_nome) 
        {
                nome = n_nome;
        }
        public void setQualJornal(Jornal n_qualJornal) 
        {
                qualJornal = n_qualJornal;
        }
        public void setJornais(List<Jornal> n_jornais) 
        {
                jornais = n_jornais;
        }
        public List<Jornal> getJornais() 
        {
                return jornais;
        }
}