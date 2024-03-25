import edu.dio.phone.diophone.DioPhone;
public class Main {
    public static void main(String[] args) {
    DioPhone myPhone = new DioPhone();

    myPhone.tocarMusica("Paradise City");
    myPhone.carregarPagina("dio.me");
    myPhone.pararMusica();
    myPhone.fazerChamada("+55449985647");
    myPhone.encerrarChamada();

    }
}