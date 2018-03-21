package com.pruebacrizz.pruebacrizz.model;

/**
 * Created by luis- on 21/03/2018.
 */

public class PhotoItem {
    private String photoId;
    private String imagen;
    private boolean isSaved = false;

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public boolean isSaved() {
        return isSaved;
    }

    public void setSaved(boolean saved) {
        isSaved = saved;
    }

    public PhotoItem (String imagen){
        this.imagen = imagen;

    }
    public PhotoItem (){

    }

    public String getRoutePhoto() {
        return routePhoto;
    }

    public void setRoutePhoto(String routePhoto) {
        this.routePhoto = routePhoto;
    }

    private String routePhoto;
}
