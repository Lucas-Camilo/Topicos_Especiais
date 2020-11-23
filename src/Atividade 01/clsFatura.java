import java.util.List;
import java.util.ArrayList;

class Fatura {
    private List<Item> itens;

    public Fatura()
    {
        itens = new ArrayList<Item>();
    }
    public List<Item> getItens()
    {
        return itens;
    }
    public void setItens(List<Item> n_itens)
    {
        itens = n_itens;
    }
    public void novoItem(Item n_item)
    {
        itens.add(n_item);
    }
    public double getValorFatura()
    {
        float valorFatura = 0.0f;
        for(int i = 0; i < itens.size(); i++)
        {
            valorFatura += (itens.get(i).getQuantidadeComprada() * itens.get(i).getPrecoItem());
        }
        double n_valorFatura = valorFatura;
        return n_valorFatura;
    }
}
