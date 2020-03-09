import java.util.Scanner;

public class Solver{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double reg = 0.0;

		while(true){
			String line = scan.nextLine();
			System.out.println("$" + line);
			String ui[] = line.split(" ");
			String cmd = ui[0];

			if(line.equals("end")){
				break;
			}else if(cmd.equals("show")){
				System.out.println(reg);
				
			}else if(cmd.equals("add")){
				double valor = Double.parseDouble(ui[1]);
				reg+=valor;
				
			}else if(cmd.equals("mult")){
				double valor = Double.parseDouble(ui[1]);
				reg*=valor;
				
			}else if(cmd.equals("div")){
				double value = Double.parseDouble(ui[1]);
				if(value == 0.0)
					System.out.println("fail: division by zero");
				else
					reg /= value;
			}else if(cmd.equals("addm")) {
				for(int i = 1; i < ui.length; i++){
					double valor = Double.parseDouble(ui[i]);
					reg+=valor;
				}
			}else{
				System.out.println("fail: command not found");
			}
		}
	}
}