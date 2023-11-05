package br.ufpb.dcx.comerciotech;

public class ProdutoJaCadastradoException extends Exception {
    public ProdutoJaCadastradoException(String id) {
        super("Produto de " + id + " já está cadastrado no estoque.");
    }
}
