class StandardProcessor{
	 
    String model = new String("PULSAR");
	public String getModel() {
		System.out.println(model);
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
     
    // standard getters/setters
}
class StandardMemory extends StandardProcessor{
    String size = new String("NX200");
    public String getsize() {
    	System.out.println(size);
		return size;
	}
	public void setsize() {
  this.size = size;
	}
     // standard constructors, getters, toString
}