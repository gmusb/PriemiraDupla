package livro;

public class Start {

    public static void main(String[] args) {
        Livro l = new Livro();
        l.setTitulo("Um Curso Em Milagres");
        l.setAutor("Helen Schucman");
        l.setIsbn(1883360749);
        l.setQtdPaginas(1454);
        l.setAno(2018);
        l.setEditora("Foundation for Inner Peace");
        l.setValor(160,00);
        l.exibir();
        l.Venda(200); 
    }
    
}
