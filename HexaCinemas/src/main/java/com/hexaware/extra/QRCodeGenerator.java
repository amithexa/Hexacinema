package com.hexaware.extra;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.sql.Date;
import java.sql.Time;

public class QRCodeGenerator {

    private static void generateQRCodeImage(String text, int width, int height, String filePath)
            throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }

    public static void getQrCode(String Username, String moviename, Date dom, Time tom, int seat) {
        try {
        	String path = "C:\\Users\\Hvuser\\Desktop\\HexaCinemas (1)\\HexaCinemas\\src\\main\\webapp\\Pages\\" + Username + seat+".png";
            generateQRCodeImage("Movie Details.\n Movie Name:- " + moviename + ".\n Movie Time- " + tom + ".\nMovie Date - " + dom + ".\nSeat No. - " + seat, 350, 350, path);
        } catch (WriterException e) {
            System.out.println("Could not generate QR Code, WriterException :: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Could not generate QR Code, IOException :: " + e.getMessage());
        }
    }
}
