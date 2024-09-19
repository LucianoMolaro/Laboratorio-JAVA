
public class OperacionMatematica {
    private double num1 = 1.6;
    private double num2 = 2.5;
    private String op;
        public void setNum1(double a){
            this.num1 = a;
        }
        public double getNum1(){
            return num1;
        }
        public void setNum2(double b){
            this.num2 = b;
        }
        public double getNum2(){
            return num2;
        }
        public void setOp(String c){
            this.op = c;
        }
        public String getOp(){
            return op;
        }

        private double sumarNumeros(){
            return num1 + num2;
        }
        private double restarNumeros(){
            return num1 - num2;
        }
        private double multiplicarNumeros(){
            return num1 * num2;
        }
        private double dividirNumeros(){
            return num1 / num2;
        }
        public double aplicarOperacion(String op){
            double result=0;
            if(op.equals("+")){
                result = sumarNumeros();
            }
            else if(op.equals("-")){
                result = restarNumeros();
            }
            else if(op.equals("*")){
                result = multiplicarNumeros();
            }
            else if(op.equals("/")){
                result = dividirNumeros();
            }
            return result;
        }


}
