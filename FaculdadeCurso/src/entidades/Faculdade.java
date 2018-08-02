package entidades;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Faculdade {

    private IntegerProperty id;
    private StringProperty nome;

    public Faculdade(IntegerProperty id, StringProperty nome) {
        this.id = id;
        this.nome = nome;
    }

    public IntegerProperty getId() {
        return id;
    }

    public void setId(IntegerProperty id) {
        this.id = id;
    }

    public StringProperty getNome() {
        return nome;
    }

    public void setNome(StringProperty nome) {
        this.nome = nome;
    }

    public void listarInformacoes() {

    }

}
