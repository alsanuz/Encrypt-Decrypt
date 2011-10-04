
public class CommandEncrypt {
	public void execute(){
		State s = State.getInstance();
		AgentEncryptDecrypt aed = new AgentEncryptDecrypt();
		String output=null;
		switch (s.method){
			case PRECIFRADO:
				output = aed.preEncrypt(s.getInput(), s.getKey());
		}
		
		s.setOutput(output);
		
		System.out.print(output);
	}
}
