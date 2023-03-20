public class Veiculo{

private String marca;	
private Double capacidadeTanqueCombustivel;

public Double getCapacidadeTanqueCombustivel() {
    return capacidadeTanqueCombustivel;
}

public void setCapacidadeTanqueCombustivel(Double capacidadedoTanqueCombustivel) {
    this.capacidadeTanqueCombustivel =    capacidadedoTanqueCombustivel;

}

public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public void acelerar() {
   
}
public void frear() {
   
}

public void buzinar()
{
	System.out.println("biiibiiii");
}	

}