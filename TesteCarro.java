public class TesteCarro
{
     public static void main(String[] args) 
    {
        Carro carro = new Carro();

        carro.setMarca("fiat");
        carro.setModelo("Pálio");
        carro.setPlaca("EDD-02503");
        carro.setRenavam(12345678);

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getPlaca());
        System.out.println(carro.getRenavam());
        
    } 
     

}