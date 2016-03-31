@RunWith(MockitoJUnitRunner.class) 
public class Mockito_Test {

	
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	if(name == null || name.trim().length()==0){
		throw new IllegalArgumentException("leer");
	}
	this.name = name;
	}
}

@Mock

