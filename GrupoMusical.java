public class GrupoMusical {
    //grupo que deseamos ver
    private String grupoMusical;
    //año en el que el grupo se fundó
    private int anoFundacion;
    //para poder ver si el grupo está separado
    private boolean grupoSeparado;
    
    public GrupoMusical(String grupoMusica, int anoF){
        grupoMusical = grupoMusica;
        anoFundacion = anoF;
        grupoSeparado = true;
    }
    
    public String getGrupoMusical(){
        return grupoMusical;
    }
        
    public int getAnoFundacion(){
        return anoFundacion;
    }
    
    public boolean getGrupoSeparado(){
        return grupoSeparado;
    }
    
    public void setGrupoMusical(String grupoM){
        grupoMusical = grupoM;
    }
    
    public void setAnoFundación(int anosActivos){
        anoFundacion = 2024 - anosActivos;
    }
    
    public void setGrupoSepara(){
        grupoSeparado = !grupoSeparado;
    }
    
    public void imprimirDetalles(){
        System.out.println("Grupo musical: " + grupoMusical + " | Ano en el que se fundo: " + anoFundacion + " | Grupo separada: " + (grupoSeparado ? "Si" : "No"));
    }
    
    public String getEstado(){
        return "Grupo musical: " + grupoMusical + " | Ano en el que se fundo: " + anoFundacion + " | Grupo separada: " + (grupoSeparado ? "Si" : "No");
    }
    }