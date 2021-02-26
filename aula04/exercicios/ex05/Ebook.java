package exercicios.ex05;

public class Ebook {
    private String titulo;
    private String autor;
    private int totalPag;
    private int paginaAtual;

    public Ebook(String titulo, String autor, int totalPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.paginaAtual = 0;
    }

    public void avancarPagina(){
        if(this.paginaAtual < this.totalPag)
            this.paginaAtual++;
    }
    public void avancarPagina(int qtde){
        if(this.paginaAtual < this.totalPag - qtde)
            this.paginaAtual += qtde;
        else
            this.paginaAtual = this.totalPag;
    }

    public void retrocederPagina(){
        if(this.paginaAtual > 0)
            this.paginaAtual--;
    }

    public void retrocederPagina(int qtde){
        if(this.paginaAtual - qtde > 0)
            this.paginaAtual--;
        else
            this.paginaAtual = 0;
    }

    public void irParaPagina(int pagina){
        if(pagina <= totalPag && pagina > -1)
            this.paginaAtual = pagina;
        else if(pagina < 0)
            this.paginaAtual = 0;
        else
            this.paginaAtual = totalPag;
    }

    public int getPagina(){
        return this.paginaAtual;
    }

    public void mostrarCapa(){
        System.out.printf("Título: %s\nAutor: %s\n",titulo,autor);
    }


}
