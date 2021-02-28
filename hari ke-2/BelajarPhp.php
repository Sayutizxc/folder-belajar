<?php
    // Deklarasi variable
    $namaBuah = "apel";
    $jumlahBuah = 5;
    echo "Itu adalah buah $namaBuah dan jumlahnya ada $jumlahBuah\n";

    // User input
    $namaBuah = readline("Masukkan nama buah : ");
    $jumlahBuah = readline("Masukkan jumlah buah : ");
    echo "Itu adalah buah $namaBuah dan jumlahnya ada $jumlahBuah\n";
    echo "--------------------------------\n";
    
    // for
    for($i = 0; $i < 5; $i++){
        echo "[for] >> Nilai [i] => $i\n";
    }
    echo "--------------------------------\n";

    // while
    $x = 0;
    while($x < 5){
        echo "[while] >> Nilai [x] => $x\n";
        $x++; 
    }
    echo "--------------------------------\n";

    // do-while
    $y = 0;
    do{
        echo "[do-while] >> Nilai [y] => $y\n";
        $y++;   
    }while($y < 5);
    echo "--------------------------------\n";

    // if
        $kondisi = true;
    if($kondisi){
        echo "[if] >> Di eksekusi jika true\n";
    }
    echo "--------------------------------\n";

    // if-else
    if(!$kondisi){
        echo "[if-else] >> Di eksekusi jika true\n";
    }else{
        echo "[if-else] >> Di eksekusi jika false\n";
    }
    echo "--------------------------------\n";

    // switch-case
    $pilihan = 2;
    switch ($pilihan)
    {
    case 1:
        echo "[switch-case] >> pilihan = 1\n";
        break;
    case 2:
        echo "[switch-case] >> pilihan = 2\n";
        break;
    case 3:
        echo "[switch-case] >> pilihan = 3\n";
        break;

    default:
        echo "[switch-case] >> pilihan tidak terdaftar\n";
        break;
    }
?>