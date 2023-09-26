private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         

    int selectedRow = getselectedRow();
    if (selectedRow == null) {
        JOptionPane.showMessageDialog(null, "Pilih nasabah terlebih dahulu");
        return;
    }
        String namaAwal = tabel.getValueAt(selectedRow, 1).toString();
        String namaAkhir = tabel.getValueAt(selectedRow, 2).toString();
        int indexNasabah = bank.getIndexNasabah(namaAwal, namaAkhir);
        TransaksiBank frame2 = new TransaksiBank(indexNasabah, bank, this); // Gantilah "JFrame2" dengan nama JFrame kedua Anda

        frame2.setVisible(true); // Menutup JFrame pertama jika diperlukan
        this.setVisible(false);

}              