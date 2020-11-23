class Main {
    public static void main(String[] args)
    {
        System.out.println("teste");
        Item novo_item = new Item(1, "Shampoo", 2, 2.50f);
        Fatura nova_fatura = new Fatura();
        
        nova_fatura.novoItem(novo_item);

        double valorTotal = nova_fatura.getValorFatura();
        
        System.out.println(valorTotal);
    }
}
