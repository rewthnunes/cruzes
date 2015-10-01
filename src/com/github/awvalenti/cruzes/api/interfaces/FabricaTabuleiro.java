package com.github.awvalenti.cruzes.api.interfaces;

import com.github.awvalenti.cruzes.api.excecoes.TamanhoInvalidoException;

public interface FabricaTabuleiro {

	TabuleiroLeituraEscrita criarTabuleiro(int numeroLinhas, int numeroColunas)
			throws TamanhoInvalidoException;

}
