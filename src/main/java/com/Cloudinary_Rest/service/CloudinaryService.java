package com.Cloudinary_Rest.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//Script que se indica en documentación de Cloudinary, hasta *
@Service
public class CloudinaryService {

    Cloudinary cloudinary;

    private Map<String, String> valuesMap = new HashMap<>();

    public CloudinaryService() {
        valuesMap.put("cloud_name","dd670xudp");
        valuesMap.put("api_key","731265149864556");
        valuesMap.put("api_secret","F1XDdsCQVPshfVIyAzGMJexUC-A");
        cloudinary = new Cloudinary(valuesMap);
    }

    public Map upload(MultipartFile multipartFile) throws IOException {
        File file = convert(multipartFile);
        Map result = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
        file.delete();
        return result;
    }

    public Map delete(String id) throws IOException {
        Map result = cloudinary.uploader().destroy(id, ObjectUtils.emptyMap());
        return result;
    }
    //*

    //Metodo que convierte multiparFile a file
    private File convert(MultipartFile multipartFile) throws IOException {
        //getOriginalFilename: Devuelve el nombre de archivo original en el sistema de archivos del cliente.
        File file = new File(multipartFile.getOriginalFilename()); //File(String path)
        //FileOutputStream: para volcar un stream de datos sobre un fichero.
        FileOutputStream fo = new FileOutputStream(file);
        //getBytes: Devuelve el contenido del archivo como una matriz de bytes.
        fo.write(multipartFile.getBytes());
        fo.close();
        return file;
    }


}
