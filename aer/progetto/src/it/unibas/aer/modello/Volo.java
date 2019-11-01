/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.aer.modello;
import it.unibas.aer.modello.state.CancellatoState;
import it.unibas.aer.modello.state.IState;
import it.unibas.aer.modello.state.InOrarioState;
import it.unibas.aer.modello.state.PartitoState;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.persistence.Column;

/**
 *
 * @author Mihai Soanea
 */
@Entity(name="volo")
public class Volo {
    private Long id;
    private String codice, luogoArrivo;
    private boolean internazionale = true, merci;
    private Calendar orarioPrevisto, orarioEffettivo;
    private IState state = new InOrarioState();
    private int ritardo;
    private String messaggio;
    private String tipo;
    private Aereoporto a;

    
    public Volo() {
    }

    public Volo(String codice, String luogoArrivo, boolean internazionale, boolean merci, Calendar orarioPrevisto, IState state) {
        this.codice = codice;
        this.luogoArrivo = luogoArrivo;
        this.internazionale = internazionale;
        this.merci = merci;
        this.orarioPrevisto = orarioPrevisto;
        this.state = state;
    }

    @Id @GeneratedValue(strategy=GenerationType.TABLE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(unique=true)
    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getLuogoArrivo() {
        return luogoArrivo;
    }

    public void setLuogoArrivo(String luogoArrivo) {
        this.luogoArrivo = luogoArrivo;
    }

    public boolean isInternazionale() {
        return internazionale;
    }

    public void setInternazionale(boolean internazionale) {
        this.internazionale = internazionale;
    }

    public boolean isMerci() {
        return merci;
    }

    public void setMerci(boolean merci) {
        this.merci = merci;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Calendar getOrarioPrevisto() {
        return orarioPrevisto;
    }

    public void setOrarioPrevisto(Calendar orarioPrevisto) {
        this.orarioPrevisto = orarioPrevisto;
    }

    @Transient
    public Calendar getOrarioEffettivo() {
        return orarioEffettivo;
    }

    public void setOrarioEffettivo(Calendar orarioEffettivo) {
        this.orarioEffettivo = orarioEffettivo;
    }

    @Transient
    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    @Transient
    public int getRitardo() {
        return ritardo;
    }

    public void setRitardo(int ritardo) {
        this.ritardo = ritardo;
    }

    @Transient
    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }
    
    public void impostaCancellato(String motivazione){
        this.setState(new CancellatoState(motivazione));
    }
    
    public void impostaPartito(Calendar orario){
        IState s = new PartitoState(orario);
        this.setState(s);
        s.gestisciVolo(a, this);
    }
    
    @Transient
    public String getTipo(){
        if(this.isMerci()){
            return "M";
        }
        return "P";
    }
    
    @Transient
    public int getOraPartenza(){
        return orarioPrevisto.get(Calendar.HOUR_OF_DAY);
    }
    
    @Transient
    public int getMinutiPartenza(){
        return orarioPrevisto.get(Calendar.MINUTE);
    }
    

}
