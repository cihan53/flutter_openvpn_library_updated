package de.blinkt.openvpn;

public interface OnVPNStatusChangeListener {
    public void onActivityForResult(boolean activityResult);
    public void onProfileLoaded(boolean profileLoaded);
    public void onVPNStatusChanged(String status);
    public void onConnectionStatusChanged(String duration, String lastPacketReceive , String byteIn , String byteOut);
}
