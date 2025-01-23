package Interfaces.Equipamentos.estabelecimento;

import Interfaces.Equipamentos.Multifuncional.EquipamentoMultifuncional;
import Interfaces.Equipamentos.copiadora.Copiadora;
import Interfaces.Equipamentos.digitalizadora.Digitalizadora;
import Interfaces.Equipamentos.impressora.Deskjet;
import Interfaces.Equipamentos.impressora.Impressora;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        em.copiar();
        em.digitalizar();
        impressora.imprimir();
    }
}
