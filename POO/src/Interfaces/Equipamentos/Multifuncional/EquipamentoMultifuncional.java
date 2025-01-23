package Interfaces.Equipamentos.Multifuncional;

import Interfaces.Equipamentos.copiadora.Copiadora;
import Interfaces.Equipamentos.digitalizadora.Digitalizadora;
import Interfaces.Equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
}
