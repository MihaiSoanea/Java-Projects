package it.unibas.strutturescheletriche.modello;

import it.unibas.strutturescheletriche.Costanti;
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Entity(name = "utente")
public class Utente implements Serializable, Comparable<Utente> {

    private static Log logger = LogFactory.getLog(Utente.class);

    private Long id;
    private String nomeUtente;
    private String password;
    private String nome;
    private String ruolo = "";
    private boolean attivo = true;
    private Calendar lastLogin = new GregorianCalendar(2014, Calendar.JANUARY, 1, 1, 0, 0);
    private boolean autenticato;
    private transient String passwordInChiaro;
    
    @Id @GeneratedValue(strategy=GenerationType.TABLE)
    public Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }
    
    @Column(unique=true)
    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    @Transient
    public boolean isAutenticato() {
        return autenticato;
    }

    public void setAutenticato(boolean autenticato) {
        this.autenticato = autenticato;
    }

    public void verifica(String password){
        String hashPasswordFornita = md5hash(password);
        if (this.getPassword().equals(hashPasswordFornita)) {
            this.setAutenticato(true);
        } else {
            this.setAutenticato(false);
        }
    }

    private String md5hash(String password) {
        String hashString = null;
        try {
            java.security.MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
            byte[] hash = digest.digest(password.getBytes());
            hashString = "";
            for (int i = 0; i < hash.length; i++) {
                hashString += Integer.toHexString(
                                  (hash[i] & 0xFF) | 0x100
                              ).toLowerCase().substring(1,3);
            }
        } catch (java.security.NoSuchAlgorithmException e) {
            logger.error(e);
        }
        return hashString;
    }


    /**
     * @return the attivo
     */
    public boolean isAttivo() {
        return attivo;
    }

    /**
     * @param attivo the attivo to set
     */
    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    /**
     * @return the lastLogin
     */
    @Temporal(TemporalType.TIMESTAMP)
    public Calendar getLastLogin() {
        return lastLogin;
    }

    /**
     * @param lastLogin the lastLogin to set
     */
    public void setLastLogin(Calendar lastLogin) {
        this.lastLogin = lastLogin;
    }

    public void setPasswordInChiaro(String passwordInChiaro){
        this.passwordInChiaro = passwordInChiaro;
    }
    
    @Transient
    public String getPasswordInChiaro(){
        return passwordInChiaro;
    }
    
    @Transient
    public boolean isFirstLogin(){
        Calendar dataCal = new GregorianCalendar(2014, Calendar.JANUARY, 1, 1, 0, 0);
        if(lastLogin.equals(dataCal)){
            return true;
        }
        return false;
    }
    
    public void cambiaPassword(){
        logger.info("\n\n **** hash md5 : " + md5hash(passwordInChiaro));
        this.password = md5hash(passwordInChiaro);
    }
    
    @Transient
    public boolean isRuoloOperatore(){
        if(this.ruolo.equalsIgnoreCase("Operatore")){
            return true;
        }
        return false;
    }
    
    @Transient
    public boolean isRuoloAdmin(){
        if(this.ruolo.equalsIgnoreCase("amministratore")){
            return true;
        }
        return false;
    }

    @Transient
    public boolean isRuoloDataEntry(){
        if(this.ruolo.equalsIgnoreCase("dataentry")){
            return true;
        }
        return false;
    }

    public int compareTo(Utente o) {
        return this.nomeUtente.compareTo(o.nomeUtente);
    }
 
    
}