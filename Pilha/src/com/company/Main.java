package com.company;

public class Main {

    public static void main(String[] args) {
	Pilha pilha = new Pilha();
	pilha.push(new Noh(1) );
	pilha.push(new Noh(2) );
	pilha.push(new Noh(3) );
	pilha.push(new Noh(4) );
	pilha.push(new Noh(5) );
		System.out.println(pilha);

    }
}
