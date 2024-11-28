package Controller;

import Model.Class.*;
import View.*;

public class Proses {
    public void prosesData(Penduduk model) {
        System.out.println("Data telah berhasil disimpan.");

        new HasilKTP(model);
    }
}
