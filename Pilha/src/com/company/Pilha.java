package com.company;

public class Pilha {

    private Noh refNohEntradaPilha;

    public  Noh top() {
        return refNohEntradaPilha;
    }
    public void push(Noh novonoh){
        Noh refAuxiliar = refNohEntradaPilha;
        refNohEntradaPilha = novonoh;
        refNohEntradaPilha.setRefNoh(refAuxiliar);
    }
    public Noh pop(){
        if(!this.isEmpty()){
            Noh nohpoped = refNohEntradaPilha;
            refNohEntradaPilha = refNohEntradaPilha.getRefNoh();
            return nohpoped;
        }
        return null;
    }

    public Pilha() {
        this.refNohEntradaPilha = null;
    }

    public boolean isEmpty(){
        return refNohEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "---------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "---------------\n";
        Noh nohAuxiliar = refNohEntradaPilha;
        while (true){
            if(nohAuxiliar!=null){
                stringRetorno += "[Noh{dado = "+ nohAuxiliar.getDado() + "}]\n";
                nohAuxiliar = nohAuxiliar.getRefNoh();
            }else{
                break;
            }
        }
            return stringRetorno;
    }
}
