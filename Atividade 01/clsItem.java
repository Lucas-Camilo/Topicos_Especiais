class Item {
    private int numeroItem;
    private String descricaoItem;
    private int quantidadeComprada;
    private float precoItem;

    public  Item(int n_numeroItem, String n_descricaoItem, int n_quantidadeComprada, float n_precoItem)
    {
        numeroItem = n_numeroItem;
        descricaoItem = n_descricaoItem;
        quantidadeComprada = n_quantidadeComprada;
        precoItem = n_quantidadeComprada;
    }
    public int getNumeroItem()
    {
        return  numeroItem;
    }
    public String getDescricaoItem()
    {
        return descricaoItem;
    }
    public int getQuantidadeComprada()
    {
        return quantidadeComprada;
    }
    public float getPrecoItem()
    {
        return precoItem;
    }

    public void setNumeroItem(int n_numeroItem)
    {
        numeroItem = n_numeroItem;
    }
    public void setDescricaoItem(String n_descricaoItem)
    {
        descricaoItem = n_descricaoItem;
    }
    public void setQuantidadeComprada(int n_quantidadeComprada)
    {
        quantidadeComprada = n_quantidadeComprada;
    }

    public void setPrecoItem(float n_precoItem)
    {
        precoItem = n_precoItem;
    }

}
