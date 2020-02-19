//Davian Lounds | 1603777 | 19/02/2020
public class Shoe {
	private int id;
	private String model;
	private float size;
	private String designer;

	public Shoe(int id, String model, float size, String designer) {
		super();
		this.id = id;
		this.model = model;
		this.size = size;
		this.designer = designer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public String getDesigner() {
		return designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
	}
	
	public String toString() {
		return "Shoe [id=" + id + ", model=" + model + ", size=" + size+ ", designer=" + designer+ "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
}
