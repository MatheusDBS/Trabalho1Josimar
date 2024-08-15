
    class Endereco {
        private String rua;
        private int numero;
        private String cidade;
    
        //Método que define os valores dentro do enderço
        public void setEndereco(String rua, int numero, String cidade) {
            this.rua = rua;
            this.numero = numero;
            this.cidade = cidade;
        }
    
        //Métodos para obter seus devidos valores
        public String getRua() {
            return rua;
        }
    
        public int getNumero() {
            return numero;
        }
    
        public String getCidade() {
            return cidade;
        }
    }


