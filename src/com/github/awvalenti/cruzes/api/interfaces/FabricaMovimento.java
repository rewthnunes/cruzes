package com.github.awvalenti.cruzes.api.interfaces;

public interface FabricaMovimento {

	Movimento criar(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino);

}
