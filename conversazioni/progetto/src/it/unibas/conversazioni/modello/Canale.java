/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.conversazioni.modello;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
/**
 *
 * @author Mihai Soanea
 */
@Entity(name="canale")
public class Canale {
    
    private Long id;
    private Utente owner;
    private String nome;
    private Calendar data = new GregorianCalendar();
    private List<Utente> listaIscritti = new ArrayList<Utente>();
    private List<String> messaggi = new ArrayList<String>();


    public Canale(Utente owner, String nome) {
        this.owner = owner;
        this.nome = nome;
    }

    public Canale() {
    }

    @Id@GeneratedValue(strategy=GenerationType.TABLE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    public Utente getOwner() {
        return owner;
    }

    public void setOwner(Utente owner) {
        this.owner = owner;
    }

    @Column(unique=true)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    @ManyToMany
    public List<Utente> getListaIscritti() {
        return listaIscritti;
    }

    public void addIscritti(Utente u){
        this.listaIscritti.add(u);
    }

    @Transient
    public List<String> getMessaggi() {
        return messaggi;
    }

    public void addMessaggio(String s){
        this.messaggi.add(s);
    }
    
    @Transient
    public String getDataFormattata(){
        DateFormat stampaData = DateFormat.getDateInstance();
        return stampaData.format(data.getTime());
    }

    @Override
    public String toString() {
        return "Canale{" + "nome=" + nome + '}';
    }
    
    
    
}
