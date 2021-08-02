package com.company;

public class Fila {

    private Noh refNohInFila;

    public Fila(){
        this.refNohInFila = null;
    }

    public boolean isEmpty(){
        return refNohInFila == null? true : false;
    }

    public void enqueue(Noh novoNoh){
            novoNoh.setRefNoh(RefNohInFila);
            RefNohInFila = novoNoh;
    }

    public Noh first(){
        if(!this.isEmpty()){
           Noh primeiroNoh = refNohInFila;
           while(true){
               if(primeiroNoh.getRefNoh != null){
                   primeiroNoh = primeiroNoh.getRefNoh();
               }else{
                   break;
               }
           }
        }
        return null;

    }

    @Override
    public String toString() {
        String stringRetorno = " ";
        Noh nohAuxiliar = refNohInFila;
        if (refNohInFila!=nul){
            while(true){
                stringRetorno +="[Noh{objeto="+nohAuxiliar.getObject()+"}] ------->";
                if (nohAuxiliar.getRefNoh!=null) {
                    nohAuxiliar = nohAuxiliar.getRefNoh();
                }else{
                    stringRetorno+=null;
                    break;
                }
            }

        }else{
            stringRetorno = null;
        }
        return stringRetorno;
    }
}
