public class invertirOracion {
    public String invertirOracion(String a) {
        if(a.isEmpty()){
            return a;
        }else{
            return invertirOracion(a.substring(1)) + a.charAt(0);
        }

    }
}
