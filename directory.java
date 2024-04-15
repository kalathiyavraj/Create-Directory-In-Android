
                File mydir = new File(getApplicationContext().getExternalFilesDir("/Android/data/com.fprimec.ipileandroid").getAbsolutePath());
                if (!mydir.exists())
                {
                    mydir.mkdirs();
                    Toast.makeText(getApplicationContext(),"Directory Created",Toast.LENGTH_LONG).show();
                }
