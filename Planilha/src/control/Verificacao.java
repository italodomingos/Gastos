package control;

public class Verificacao {
    
    
    public String[] verData(String mes) {
        String cal[] = new String[2];
        switch (mes.toLowerCase()) {
            case "janeiro":
                cal[0] = "2018-01-01";
                cal[1] = "2018-01-31";

                return cal;
            case "fevereiro":
                cal[0] = "2018-02-01";
                cal[1] = "2018-02-31";

                return cal;
            case "março":
                cal[0] = "2018-03-01";
                cal[1] = "2018-03-31";

                return cal;
            case "abril":
                cal[0] = "2018-04-01";
                cal[1] = "2018-04-31";

                return cal;
            case "maio":
                cal[0] = "2018-05-01";
                cal[1] = "2018-05-31";

                return cal;
            case "junho":
                cal[0] = "2018-06-01";
                cal[1] = "2018-06-31";

                return cal;
            case "julho":
                cal[0] = "2018-07-01";
                cal[1] = "2018-07-31";

                return cal;
            case "agosto":
                cal[0] = "2018-08-01";
                cal[1] = "2018-08-31";

                return cal;
            case "setembro":
                cal[0] = "2018-09-01";
                cal[1] = "2018-09-31";

                return cal;
            case "outubro":
                cal[0] = "2018-10-01";
                cal[1] = "2018-10-31";

                return cal;
            case "novembro":
                cal[0] = "2018-11-01";
                cal[1] = "2018-11-31";

                return cal;
            case "dezembro":
                cal[0] = "2018-12-01";
                cal[1] = "2018-12-31";

                return cal;
        }
        return cal;

    }

}
