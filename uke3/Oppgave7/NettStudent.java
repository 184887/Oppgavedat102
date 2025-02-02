package uke3.Oppgave7;

public class NettStudent extends Student {
    private String hjemSted;

    public NettStudent(String fornavn, String etternavn, String studieSted, String hjemSted) {
        super(fornavn, etternavn, studieSted);
        this.hjemSted = hjemSted; 
    }

    public String getHjemSted() {
        return hjemSted;
    }

    public void setEmail(String hjemSted) {
        this.hjemSted = hjemSted;
    }

    @Override
    public String toString() {
        return super.toString() + " " + hjemSted;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((hjemSted == null) ? 0 : hjemSted.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        NettStudent other = (NettStudent) obj;
        if (hjemSted == null) {
            if (other.hjemSted != null)
                return false;
        } else if (!hjemSted.equals(other.hjemSted))
            return false;
        return true;
    }

    
    
}
