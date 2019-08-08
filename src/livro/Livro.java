package livro;


public class Livro {
    private String titulo;
    private String autor;
    private int isbn;
    private int qtdPaginas;
    private int ano;
    private String editora;
    private Double valor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public double Venda(int qtd){
    return (qtd * valor);
    }
    
    public String exibir(){
    return "O livro "+this.titulo+" escrito pelo autor "+this.autor+"\n"
            + " foi escrito em "+this.ano+", editora: "+this.editora+" isbn: "+this.isbn+" valor: "+Double.toString(this.valor)+"\n"
            + "Quantidade de páginas: "+Integer.toString(this.qtdPaginas);
    }
    
}
