
//Classes ABSTRATAS não podem ser instanciadas
public abstract class Forma {
	//Apenas classes ABSTRATAS devem possuir métodos abstratos
	//Todo método ABSTRATO deve ser reescrito nas classes filhas
	//Métodos ABSTRATOS não possuem implementação, pois devem ser reescritos
	public abstract void desenhar();
}
