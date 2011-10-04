enum Method{ 
	PRECIFRADO
};

public class State {
    private static State INSTANCE = new State();
    // Clase singleton
    
    public String input, output;
    int key;
    Method method;
    
    private State() {}
 
    public static State getInstance() {
        return INSTANCE;
    }

    // Getters y setters
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

}