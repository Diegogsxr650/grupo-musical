public class GrupoMusical {
    //grupo que deseamos ver
    private String grupoMusical;
    //año en el que el grupo se fundó
    private int añoFundación;
    //para poder ver si el grupo está separado
    private boolean grupoSeparado;
    
    public GrupoMusical(String grupoMusica, int añoF){
        grupoMusical = grupoMusica;
        añoFundación = añoF;
        grupoSeparado = true;
    }
    
    public String getGrupoMusical(){
        return grupoMusical;
    }
        
    public int getAñoFundación(){
        return añoFundación;
    }
    
    public boolean getGrupoSeparado(){
        return grupoSeparado;
    }
    
    public void setGrupoMusical(String grupoM){
        grupoMusical = grupoM;
    }
    
    public void setAñoFundación(int añosActivos){
        añoFundación = 2024 - añosActivos;
    }
    
    public void setGrupoSepara(){
        grupoSeparado = !grupoSeparado;
    }









}