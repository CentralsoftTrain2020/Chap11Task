package seishiroUshijima.renshu1.mondai4;

public class ShainFactory {
	public Shain getShain( String command )
	{
		Shain shain =null;
		switch( command )
		{
			case "平社員":
				shain = new HiraShain();
				break;
			case "主任":
				shain = new Shunin();
				break;
			case "部長":
				shain = new Bucho();
				break;
		}
		return shain;
	}

}
