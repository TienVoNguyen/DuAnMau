/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xhelper;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.swing.JPanel;
import mydao.QRCodeDao;
import myentity.NhanVien;
import myinterfaces.BaseDaoInterface;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import view.HomeFrm;
import view.LogInFrm;

/**
 *
 * @author NTV
 */
public class XQRCode {

    
    public static String writeQRCode() throws Exception {
        //        tạo qr code
        String code = String.format("%.0f", (Math.random() * (999999 - 111110 + 1) + 111110));
        String maQR = Auth.nguoiDungHienTai.getMaNV() + code;
        ByteArrayOutputStream out = QRCode.from(maQR)
                .to(ImageType.PNG).stream();

        String f_name = Auth.nguoiDungHienTai.getMaNV();
        String Path_name = "./qrCode/";

        FileOutputStream fout = new FileOutputStream(new File(Path_name + (f_name + ".PNG")));
        fout.write(out.toByteArray());
        fout.flush();
        return maQR;
    }

    public static void readQRCode(String maQR) {
        
    }
    
     
}
